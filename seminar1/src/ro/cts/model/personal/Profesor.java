package ro.cts.model.personal;

public  class Profesor extends Persoana implements iPredabil {

    private int id;
    private int vechime;

    public Profesor(String nume, int varsta, int id, int vechime) {
        super(nume, varsta);
        this.id = id;
        this.vechime = vechime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }



    @Override
    public void preda() {
        StringBuilder sb=new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(" preda la curs");
        System.out.println(sb);
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb=new StringBuilder("Profesorul preda de ");
        sb.append(this.vechime);
        sb.append(" ani");
        System.out.println(sb);
    }
}
