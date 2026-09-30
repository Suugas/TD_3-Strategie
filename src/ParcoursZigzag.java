public class ParcoursZigzag extends Parcours {

    public ParcoursZigzag(TableauEntier tab) {
        super(tab);
    }

    @Override
    public void suivant() {
        boolean isMod2 = this.ligneCour % 2 == 0;
        if(this.colonneCour == 0 || this.colonneCour == this.tab.getLargeur()){
            if (this.tab.getLongueur() > this.ligneCour) this.ligneCour++;
        }else this.colonneCour += isMod2 ? 1 : -1;
    }
}
