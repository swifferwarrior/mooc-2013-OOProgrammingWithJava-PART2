
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getRegCode() {
        return regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.country)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null || this.country == null) {
            return 7;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }

}

/*POST-SUBMIT NOTES */
/*
1. HASHCODE
        Check that both regCode and country are not null.
*/
