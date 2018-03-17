class Destino{
    int indiceProxVertice; 
    int distancia; 
    
    Destino (int v, int d){
        indiceProxVertice = v; 
        distancia = d; 
    }
}
class Vertice{
    Destino destinos[]; 

    Vertice(Destino d){
        destinos = new Destino[1]; 
        destinos[0] = d;
    }

    Vertice (Destino d0, Destino d1){
        destinos = new Destino[2]; 
        destinos[0] = d0; 
        destinos[1] = d1; 
    }
}

class problem{

    static Vertice v[] = {
        new Vertice(new Destino( 1, 54), new Destino( 3, 75)),   //Posição 0
        new Vertice(new Destino( 2, 80), new Destino( 4, 163)),  //Posição 1
        new Vertice(new Destino( 7, 136)),                       //Posição 2
        new Vertice(new Destino( 5, 25), new Destino( 4, 154)),  //Posição 3
        new Vertice(new Destino( 7, 66)),                        //Posição 4
        new Vertice(new Destino( 6, 122), new Destino( 8, 106)), //Posição 5
        new Vertice(new Destino( 7, 84), new Destino( 4, 62)),   //Posição 6
        new Vertice(new Destino(10, 92), new Destino(11, 132)),  //Posição 7
        new Vertice(new Destino( 6, 23), new Destino( 9, 52)),   //Posição 8
        new Vertice(new Destino(10, 84), new Destino( 7, 66)),   //Posição 9
        new Vertice(new Destino(11, 65), new Destino(13, 95)),   //Posição 10
        new Vertice(new Destino(12, 62), new Destino(13, 11)),   //Posição 11
        new Vertice(new Destino(15, 97)),                        //Posição 12
        new Vertice(new Destino(14, 74), new Destino(12, 36)),   //Posição 13
        new Vertice(new Destino(15, 47)) };                      //Posição 14

    public static void main(String[] agrs){
        
        int distanciaAteProxVertice = 0; 
        int indicedoVerticeDestino = 0; 
        int distancia_total = 0; 
        int i = 0, cont = 0; 

        System.out.println("Calculando a rota\n\n");

        while(indicedoVerticeDestino != 15){
            i = indicedoVerticeDestino; 
            indicedoVerticeDestino = v[i].destinos[0].indiceProxVertice;
            distanciaAteProxVertice = v[i].destinos[0].distancia; 
            distancia_total += distanciaAteProxVertice;
            System.out.println("Prox. vertice: " + (indicedoVerticeDestino + 1) + " Distancia: " + distanciaAteProxVertice + " km"); 
            cont++; 
        }

        System.out.println("\n\nTotal de cidades visitadas: "+cont); 
        System.out.println("\nDistancia total percorrida: "+distancia_total + " km");

    }
}
