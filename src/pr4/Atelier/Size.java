package pr4.Atelier;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40)
    ;
    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }

    public int getEuroSize() {
        return euroSize;
    }
}
