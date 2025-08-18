package domain;

public class Cliente {
    
    private String nome;
    private long cpf;
    private long tel;
    private String end;
    private int numero;
    private String cidade;
    private String estado;

    public Cliente() {
    }

    public Cliente(long cpf, String nome , long tel, String end, int numero, String cidade, String estado) {
        this.cpf = cpf;
        this.nome = nome;
        this.tel = tel;
        this.end = end;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Cliente(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.cpf == other.cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
}
