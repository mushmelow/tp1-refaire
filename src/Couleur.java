/**
 * Created by Hao on 2016-09-28.
 */
public class Couleur {

    private int rouge;
    private int bleu;
    private int vert;


    public Couleur(int rouge, int bleu, int vert) {
        this.rouge = rouge;
        this.bleu = bleu;
        this.vert = vert;
    }

    public void blanchir(){
        rouge = ( rouge + 255 ) / 2;
        vert = ( vert + 255 ) / 2;
        bleu = ( bleu + 255 ) / 2;

    }


    public int getVert() {
        return vert;
    }

    public int getRouge() {
        return rouge;
    }

    public int getBleu() {
        return bleu;
    }


    public void setRouge(int rouge) {
        if(rouge>=0 && rouge<= 255) {
            this.rouge = rouge;
        }
    }

    public void setBleu(int bleu) {
        if(bleu>=0 && bleu<= 255) {

            this.bleu = bleu;
        }
    }

    public void setVert(int vert) {
        if(rouge>=0 && rouge<= 255)
        this.vert = vert;
    }


    @Override
    public String toString() {
        return "Couleur{" +
                "rouge=" + rouge +
                ", bleu=" + bleu +
                ", vert=" + vert +
                '}';
    }


}




