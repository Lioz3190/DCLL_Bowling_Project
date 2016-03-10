package dcll.ddan.bowling;

/**
 * Created by Lioz-MBPR on 07/03/16.
 */

/* réponse à l'exigence Frame #1 */
public class Frame {
    private Lancer quillesTombees[];

    /* réponse à l'exigence #8 */
    public Frame() {
        this.quillesTombees = new Lancer[2];
    }

    public Lancer[] getQuillesTombees() {
        return quillesTombees;
    }

    public void setQuillesTombees(Lancer[] quillesTombees) {
        this.quillesTombees = quillesTombees;
    }
}
