public class ParcoursLigne extends Parcours {

    public ParcoursLigne(TableauEntier tab) {
        super(tab);
    }

    public ParcoursLigne(int[][] tab) {
        super(tab);
    }

    @Override
    public void suivant() {
        this.colonneCour++;
        if (this.colonneCour >= this.tab.getLongueur()) {
            this.colonneCour = 0;
            this.ligneCour++;
        }
    }
}
