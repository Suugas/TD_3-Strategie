public class ParcoursColonne extends Parcours{

    public ParcoursColonne(TableauEntier tab){
        super(tab);
    }

    public void suivant(){
        this.ligneCour++;
        if(this.ligneCour>=this.tab.getLongueur()){
            this.ligneCour = 0;
            this.colonneCour++;
        }
    }
}
