package AttAula9;

public class Pessoa {
    private String name;
    private Integer id_Father;
    private Integer id_Mother;

    public void setName(String name, Integer father, Integer mother) {
        this.name = name;
        this.id_Father = father;
        this.id_Mother = mother;
    }

    boolean equalsPessoa(String pessoa1, String pessoa2){
        if(pessoa1 == pessoa2){
            return true;
        } else {
            return false;
        }
    }


}
