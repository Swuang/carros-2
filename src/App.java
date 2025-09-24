import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Fabricante fabricante = new Fabricante();
        fabricante.setId(02);        
        fabricante.setNome("Renault");
        fabricante.setCnpj("1234567890");
        fabricante.setCidade("Jataí");
        
        Veiculo veiculo = new Veiculo();
        veiculo.setId(03);        
        veiculo.setPlaca("ABCD");
        veiculo.setNome("Kwid");
        veiculo.setFabricante(fabricante);
        veiculo.setAno(10);
        veiculo.setModelo(11);

        #tibas
        veiculo.imprimirDadosDoVeiculo();
    }

 }