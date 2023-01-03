package br.com.ipcalculator.model;

import java.io.Serializable;


public class Ip implements Serializable {

    private String ipAdress;
    private String mask;
    private String maskBinarie;
    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Ip(){}
    
    public Ip(String ipAdress, String mask) {
        this.ipAdress = ipAdress;
        this.mask = mask;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public void setMaskBinarie(String maskBinarie) {
        this.maskBinarie = maskBinarie;
    }

    public String getMaskBinarie() {
        return this.maskBinarie;
    }

    @Override
    public String toString() {
        return "Ip: " + this.ipAdress + "\nMascara: " + this.mask;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ipAdress == null) ? 0 : ipAdress.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        result = prime * result + ((maskBinarie == null) ? 0 : maskBinarie.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ip other = (Ip) obj;
        if (ipAdress == null) {
            if (other.ipAdress != null)
                return false;
        } else if (!ipAdress.equals(other.ipAdress))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        if (maskBinarie == null) {
            if (other.maskBinarie != null)
                return false;
        } else if (!maskBinarie.equals(other.maskBinarie))
            return false;
        return true;
    }

}
