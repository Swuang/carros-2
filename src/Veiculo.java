public class Veiculo {
    private Integer id;
    private String placa;
    private String nome;
    private Fabricante fabricante;
    private Integer ano;
    private Integer modelo;

    public Integer getId() {
        return id;
        
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getPlaca () {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fabricante getFabricante() {
        return fabricante;
        
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    void imprimirDadosDoVeiculo() {
        System.out.println("ID: " + this.getId());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Fabricante: " + this.getFabricante().getNome());
        System.out.println("CNPJ do Fabricante: " + this.getFabricante().getCnpj());
        System.out.println("Cidade do Fabricante: " + this.getFabricante().getCidade());
    }
}
