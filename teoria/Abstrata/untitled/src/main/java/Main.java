public class Main {
    public static void main(String[] args) {
        Cachorro ca = new Cachorro("pitoco", 2);
        Lontra lon = new Lontra("lontra top", 44);
        Boi bo = new Boi("boi da cara preta", 1400);

        System.out.println("---------------------------");
        ca.emitirSom();
        ca.mostrarInfo();
        System.out.println("---------------------------");
        lon.emitirSom();
        lon.mostrarInfo();
        lon.nadar();
        System.out.println("---------------------------");
        bo.emitirSom();
        bo.mostrarInfo();
    }
}
