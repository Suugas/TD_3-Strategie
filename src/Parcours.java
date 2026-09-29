import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class Parcours implements Iterator<Integer> {

    protected TableauEntier tab;
    protected int ligneCour;
    protected int colonneCour;
    protected int nbParcourus;

    public Parcours(TableauEntier tab) {
        this.tab = tab;
        this.ligneCour = 0;
        this.colonneCour = 0;
        this.nbParcourus = 0;
    }

    public abstract void suivant();

    @Override
    public boolean hasNext() {
        return this.tab != null && this.nbParcourus < (this.tab.getLargeur() * this.tab.getLongueur());
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int val = this.tab.valeurA(this.ligneCour, this.colonneCour);
        this.nbParcourus++;
        this.suivant();
        return val;
    }


}
