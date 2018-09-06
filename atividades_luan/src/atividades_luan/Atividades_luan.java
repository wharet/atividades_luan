package atividades_luan;

public class Atividades_luan {

    public static void main(String[] args) {
        
        Objecto obj = new Objecto(System.in);
        
        switch(menu) {
            
            case 5:
            case 1: System.out.println("01. Cadastrar valor");
            case 2: System.out.println("02. Buscar Maior");
            case 3: System.out.println("03. Buscar Menor");
            case 4: System.out.println("04. Ler Media");
            case 0: System.out.println("05. Sair");
            if(menu=0) {
                System.out.println("Tchau");
            }
            
            while(menu<>0);
        }
        
    }
    
}
