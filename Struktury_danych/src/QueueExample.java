public class QueueExample {

    Element first, last;

    private class Element{
        private double d;
        private Element next;

        public Element(double val){
            d=val;
            next=null;
        }

        public void setNext(Element o){
            next=o;
        }

        public Element getNext(){
            return next;
        }

        public double getValue(){
            return d;
        }
    }

    public QueueExample(){
        first=last=null;
    }

    public void dodaj(double war){
        Element el=new Element(war);
        if(first==null){
            first=last=el;
        }
        else {
            last.setNext(el);
            last=el;
        }
    }

    public double pobierz() throws IndexOutOfBoundsException{
        double tmp =0.0;
        if(first!=null){
            tmp = first.getValue();
            first=first.getNext();
        }
        else {
            throw new IndexOutOfBoundsException("Kolejka jest pusta");
        }
        return tmp;
    }

    public int size(){
        int roz=0;
        Element tmp;
        if(first==null){
            return roz;
        }
        else {
            tmp=first.getNext();
            roz++;
            while(tmp!=null) {
                tmp=tmp.getNext();
                roz++;
            }
            return roz;
        }
    }

    public void wyswietlAll(){
        if(first!=null){
            Element tmp = first;
            System.out.println();
            System.out.print(tmp.getValue()+" ");
            while(tmp.getNext()!=null){
                tmp=tmp.getNext();
                System.out.print(tmp.getValue()+" ");
            }
            System.out.println();
        }
    }

}
