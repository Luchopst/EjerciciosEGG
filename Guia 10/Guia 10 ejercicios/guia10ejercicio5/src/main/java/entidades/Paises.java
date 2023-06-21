package entidades;

import java.util.Comparator;
import java.util.Objects;

public class Paises implements Comparable<Paises> {
    private String pais;

    public Paises() {}

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return "Paises{" + "paises=" + pais + '}';
    }
    
    
    @Override
    public int compareTo(Paises p) {
        return this.pais.compareTo(p.getPais());
    }

    public static Comparator<Paises> OrdenarPaises = new Comparator<Paises>() {
        @Override
        public int compare(Paises p1, Paises p2) {
            return p1.getPais().compareTo(p2.getPais());
        }
    };
}
