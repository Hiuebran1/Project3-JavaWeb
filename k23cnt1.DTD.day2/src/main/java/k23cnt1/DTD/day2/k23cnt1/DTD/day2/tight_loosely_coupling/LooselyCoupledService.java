package k23cnt1.DTD.day2.k23cnt1.DTD.day2.tight_loosely_coupling;

public class LooselyCoupledService {
    private SortAlgorithm sortAlgorithm;
    public LooselyCoupledService () {}
    public LooselyCoupledService (SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;

    }
    public void complexBusiness(int[] array) {

        sortAlgorithm.sort(arraay);

    }
    public static void main(String[] args){
    LooselyCoupledService sortAlogithm =
            new LooselyCoupledService(new LooselyBubbleSortAlgorithm());
    sortAlogithm.complexBusiness(new int[]{11,12,13,14,15});
    }
}
