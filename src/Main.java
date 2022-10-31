public class Main {
    public static void main(String[] args) {

        //aqui comienza el if
        int numeroIf = 0;
        
        if(numeroIf < 0){
            System.out.println(numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        }else {
            System.out.println("la variable num1 contiene un " + numeroIf);
        }


        //aqui comienza el while
        int numeroWhile = 1;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("la variable numeroWhile ahora contiene un " + numeroWhile);
        }



        //aqui comineza el do-while
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora contiene un: " + numeroDoWhile);
        }while(numeroDoWhile < 3);



        //aqui comienza el for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor ahora contiene un: " + numeroFor);
        }

        //aqui comienza el switch
        String estacion = "primavera";

        switch (estacion){
            case "primavera":
                System.out.println("es primavera");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("es verano");
                break;
        }

    }
}