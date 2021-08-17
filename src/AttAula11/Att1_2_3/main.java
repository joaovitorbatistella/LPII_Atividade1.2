package AttAula11.Att1_2_3;

public class main {
    public static void main(String[] args) {
        Cachorro animal1 = new Cachorro("Toby", 1, "auau", "correr");
        Cavalo animal2 = new Cavalo("Horse", 5, "hiiiho", "correr");
        Preguica animal3 = new Preguica("Aristolfo", 2, "ronc", "subir em arvores");
        Veterinario veterinario = new Veterinario();

        animal1.correr();
        animal1.emitirSom();
        System.out.println("-----");
        animal2.correr();
        animal2.emitirSom();
        System.out.println("-----");
        animal3.subirEmArvore();
        animal3.emitirSom();
        System.out.println("----------");
        veterinario.examinar(animal1);
        veterinario.examinar(animal2);
        veterinario.examinar(animal3);

    }
}
