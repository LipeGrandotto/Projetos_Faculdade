package prototype;


public class Usuario implements Prototype {
    private int ID;
    private String email;
    private String senha;
    private String nome;
    
    public Usuario(Usuario usuario){
        this.ID = usuario.ID;
        this.email = usuario.email;
        this.nome = usuario.nome;
        this.senha = usuario.senha;
    }
    
    public Usuario(){
        
    }
    
    @Override
    public Prototype clone(){
        return new Usuario(this);
    }

    @Override
    public String toString() {
        return "Usuario{" + "ID=" + ID 
                + ", email=" + email 
                + ", senha=" + senha 
                + ", nome=" + nome +'}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
