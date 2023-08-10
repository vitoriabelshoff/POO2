public class MyClass {
    public static void main(String args[]) {
    }
}
public class Seguro{
    float valor;
    boolean vigencia;
    
    private Veiculo veiculo;
    private Cliente proprietario;
    private Cliente[] assegurados;
    
}
public class Cliente{
    String nome;
    String cpf;
}
public class Veiculo{
    int ano;
    String marca;
    String cor;
    String placa;
    
    private Modelo modelo;
}
public class Modelo{
    String nome;
}
