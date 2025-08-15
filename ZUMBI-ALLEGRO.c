#include <allegro.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>

#define LINHAS 12
#define COLUNAS 12
#define PESSOA 'P'
#define ZUMBI 'Z'
#define BIBLIOTECA 'B'
#define VAZIO '.'
#define OBSTACULO '#'
#define PIXELS 64 


void mover_zumbi(char mapa[LINHAS][COLUNAS], int *linha_zumbi, int *coluna_zumbi, int linha_pessoa, int coluna_pessoa) {
    int nova_linha = *linha_zumbi;
    int nova_coluna = *coluna_zumbi;
    int passo = 1;

    do {
        // Tenta mover verticalmente primeiro 
        if (linha_pessoa > nova_linha && passo == 1) {
            nova_linha++;
            if (mapa[nova_linha][nova_coluna] == OBSTACULO || mapa[nova_linha][nova_coluna] == ZUMBI) {
                nova_linha--;
                passo++;
            }
            passo--;
        }
        if (linha_pessoa < nova_linha && passo == 1) {
            nova_linha--;
            if (mapa[nova_linha][nova_coluna] == OBSTACULO || mapa[nova_linha][nova_coluna] == ZUMBI) {
                nova_linha++;
                passo++;
            }
            passo--;
        }

        // Tenta mover horizontalmente 
        if (coluna_pessoa > nova_coluna && passo == 1) {
            nova_coluna++;
            if (mapa[nova_linha][nova_coluna] == OBSTACULO || mapa[nova_linha][nova_coluna] == ZUMBI) {
                nova_coluna--;
            }
            passo--;
        }
        if (coluna_pessoa < nova_coluna && passo == 1) {
            nova_coluna--;
            if (mapa[nova_linha][nova_coluna] == OBSTACULO || mapa[nova_linha][nova_coluna] == ZUMBI) {
                nova_coluna++;
            }
            passo--;
        }
        if (coluna_pessoa == nova_coluna) {
            break;
        }
    } while (passo == 1);

    // Atualiza mapa
    mapa[*linha_zumbi][*coluna_zumbi] = VAZIO;
    mapa[nova_linha][nova_coluna] = ZUMBI;

    // Atualiza posição do zumbi
    *linha_zumbi = nova_linha;
    *coluna_zumbi = nova_coluna;
}

int main() {
    setlocale(LC_ALL, "Portuguese");
    char mapa[LINHAS][COLUNAS];
    int i, j;
    int linha_zumbi, coluna_zumbi,linha_zumbi2, coluna_zumbi2, linha_pessoa, coluna_pessoa, linha_biblioteca, coluna_biblioteca, game_state = 0,jogador_se_moveu;

    srand(time(NULL));

    // PREENCHE O MAPA COM OS OBSTACULOS E A BORDA FEITA DE OBSTACULOS
    for (i = 0; i < LINHAS; i++) {
        for (j = 0; j < COLUNAS; j++) {
            if (i == 0 || i == LINHAS - 1 || j == 0 || j == COLUNAS - 1) {
                mapa[i][j] = OBSTACULO;
            } else {
                if (rand() % 8 == 0) { // 1 OITAVO DE OBSTACULOS
                    mapa[i][j] = OBSTACULO;
                } else {
                    mapa[i][j] = VAZIO;
                }
            }
        }
    }

    // POSICIONA A BIBLIOTECA NO CANTO DO MAPA
    linha_biblioteca = 10;
    coluna_biblioteca = 10;
    mapa[10][10] = BIBLIOTECA;

    // COLOCA A PESSOA NO MAPA
    do {
        linha_pessoa = rand() % LINHAS;
        coluna_pessoa = rand() % COLUNAS;
    } while (mapa[linha_pessoa][coluna_pessoa] != VAZIO);
    mapa[linha_pessoa][coluna_pessoa] = PESSOA;

    // COLOCA O ZUMBI 1 NO MAPA
    do {
        linha_zumbi = rand() % LINHAS;
        coluna_zumbi = rand() % COLUNAS;
    } while (mapa[linha_zumbi][coluna_zumbi] != VAZIO);
    mapa[linha_zumbi][coluna_zumbi] = ZUMBI;

    // COLOCA O ZUMBI 2 NO MAPA
    do {
        linha_zumbi2 = rand() % LINHAS;
        coluna_zumbi2 = rand() % COLUNAS;
    } while (mapa[linha_zumbi2][coluna_zumbi2] != VAZIO);
    mapa[linha_zumbi2][coluna_zumbi2] = ZUMBI;

    // INICIALIZANDO O ALLEGRO
    allegro_init();
    install_timer();
    install_keyboard();
    set_color_depth(32);
    set_gfx_mode(GFX_AUTODETECT_WINDOWED, 800, 730, 0, 0);
    set_window_title("Jogo de Zumbis");
    
    BITMAP* buffer = create_bitmap(800, 730);
    
    // LENDO AS IMAGENS
    BITMAP* mapas_bmp = load_bitmap("mapa.bmp", NULL);
    BITMAP* saida_bmp = load_bitmap("saida.bmp", NULL);
    BITMAP* pessoa_bmp = load_bitmap("pessoa.bmp", NULL);
    BITMAP* zumbi_bmp = load_bitmap("zumbi.bmp", NULL);
    BITMAP* obstaculo_bmp = load_bitmap("parede.bmp", NULL);
    BITMAP* venceu_bmp = load_bitmap("ganhou.bmp", NULL);
    BITMAP* perdeu_bmp = load_bitmap("perdeu.bmp", NULL);


    // LOOP DO PROGRAMA, ATUALIZANDO AS IMAGENS E MOVIMENTANDO
    while (!key[KEY_ESC] && game_state == 0) {
        
        jogador_se_moveu = 0;

        // MOVIMENTO DO JOGADOR
        if (key[KEY_RIGHT]) {
            if (coluna_pessoa + 1 < COLUNAS && mapa[linha_pessoa][coluna_pessoa + 1] != OBSTACULO) {
                mapa[linha_pessoa][coluna_pessoa] = VAZIO;
                coluna_pessoa++;
                mapa[linha_pessoa][coluna_pessoa] = PESSOA;
                jogador_se_moveu = 1;
            }
        }
        else if (key[KEY_LEFT]) {
            if (coluna_pessoa - 1 >= 0 && mapa[linha_pessoa][coluna_pessoa - 1] != OBSTACULO) {
                mapa[linha_pessoa][coluna_pessoa] = VAZIO;
                coluna_pessoa--;
                mapa[linha_pessoa][coluna_pessoa] = PESSOA;
                jogador_se_moveu = 1;
            }
        }
        else if (key[KEY_UP]) {
            if (linha_pessoa - 1 >= 0 && mapa[linha_pessoa - 1][coluna_pessoa] != OBSTACULO) {
                mapa[linha_pessoa][coluna_pessoa] = VAZIO;
                linha_pessoa--;
                mapa[linha_pessoa][coluna_pessoa] = PESSOA;
                jogador_se_moveu = 1;
            }
        }
        else if (key[KEY_DOWN]) {
            if (linha_pessoa + 1 < LINHAS && mapa[linha_pessoa + 1][coluna_pessoa] != OBSTACULO) {
                mapa[linha_pessoa][coluna_pessoa] = VAZIO;
                linha_pessoa++;
                mapa[linha_pessoa][coluna_pessoa] = PESSOA;
                jogador_se_moveu = 1;
            }
        }
        rest(150); // TENTA EVITAR VARIOS MOVIMENTOS SEGUIDOS E TAMBEM TENTA EVITAR O JOGO FICAR DEMORADO A CADA COMANDO

        // MOVE O ZUMBI DEPOIS DA PESSOA
        if (jogador_se_moveu) {

            mover_zumbi(mapa, &linha_zumbi, &coluna_zumbi, linha_pessoa, coluna_pessoa);
            mover_zumbi(mapa, &linha_zumbi2, &coluna_zumbi2, linha_pessoa, coluna_pessoa);

            // IMPRIME A MATRIZ
            printf("\n");
            for (i = 0; i < LINHAS; i++) {
                for (j = 0; j < COLUNAS; j++) {
                    printf("%c ", mapa[i][j]);
                }
                printf("\n");
            }
            printf("\n");
        }
        
        // GANHOU OU PERDEU
        if (linha_pessoa == linha_biblioteca && coluna_pessoa == coluna_biblioteca) {
            game_state = 1; // ESTADO DO JOGO = 1 VENCEU
        }
        if ((linha_pessoa == linha_zumbi && coluna_pessoa == coluna_zumbi) || 
            (linha_pessoa == linha_zumbi2 && coluna_pessoa == coluna_zumbi2)) {
            game_state = 2; // ESTADO = 2 PERDEU
        } // ESTADO IGUAL A 0 ESTÁ JOGANDO

        // LIMPA A TELA E COLOCA O FUNDO E DEPOIS O RESTO
        clear_to_color(buffer, makecol(0, 0, 0));
        draw_sprite(buffer, mapas_bmp, 0, 0);

        for (i = 0; i < LINHAS; i++) {
            for (j = 0; j < COLUNAS; j++) {
                if (mapa[i][j] == OBSTACULO) {
                    draw_sprite(buffer, obstaculo_bmp, j * PIXELS, i * PIXELS);
                }
            }
        }
        
        draw_sprite(buffer, pessoa_bmp, coluna_pessoa * PIXELS, linha_pessoa * PIXELS); // INICIA A IMAGEM NO EXE E ATUALIZA A PESSOA
        draw_sprite(buffer, saida_bmp, coluna_biblioteca * PIXELS, linha_biblioteca * PIXELS); // INICIA A IMAGEM NO EXE E ATUALIZA A BIBLIOTECA
        draw_sprite(buffer, zumbi_bmp, coluna_zumbi * PIXELS, linha_zumbi * PIXELS); // INICIA A IMAGEM NO EXE E ATUALIZA 1 ZUMBI
        draw_sprite(buffer, zumbi_bmp, coluna_zumbi2 * PIXELS, linha_zumbi2 * PIXELS); // INICIA A IMAGEM NO EXE E ATUALIZA 2 ZUMBI

        draw_sprite(screen, buffer, 0, 0);
    }
    
    // MOSTRA A TELA SE GANHOU OU PERDEU
    if (game_state == 1) {
        clear_to_color(buffer, makecol(0,0,0));
        draw_sprite(buffer, venceu_bmp, 0, 0);
        draw_sprite(screen, buffer, 0, 0);
        while(!key[KEY_ESC]){
            rest(10);
        }
    }
     // PERDEU
    if (game_state == 2) {
        clear_to_color(buffer, makecol(0,0,0));
        draw_sprite(buffer, perdeu_bmp, 0, 0);
        draw_sprite(screen, buffer, 0, 0);
        while(!key[KEY_ESC]){
            rest(10);
        }
    }

   	// DESTRUINDO OS BITMAPS E LIBERANDO MEMORIAS
    destroy_bitmap(buffer);
    destroy_bitmap(mapas_bmp);
    destroy_bitmap(saida_bmp);
    destroy_bitmap(pessoa_bmp);
    destroy_bitmap(zumbi_bmp);
    destroy_bitmap(obstaculo_bmp);
    destroy_bitmap(venceu_bmp);
    destroy_bitmap(perdeu_bmp);
    
    return 0;
}
END_OF_MAIN();

