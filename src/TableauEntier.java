public class TableauEntier {

    private int[][] tab;

    public TableauEntier(int[][] t){
        this.tab = t;
    }

    public int valeurA(int l, int c){
        if((l<this.tab.length) && (c<this.tab[l].length)){

        }
        return  this.tab[l][c];
    }

    public int getLargeur(){
        return this.tab.length;
    }

    public int getLongueur(){
        int l = 0;
        if (this.tab.length>0) {
            l = this.tab[0].length;
        }
        return l;
    }

    public ParcoursLigne iterateurLigne(){

        return  new ParcoursLigne(this);

    }

}
