package vacataireGUI;

public class Vacataire {


    private static int matricule;
    private String nom;
    private String prenom;
    private String Genre;
    private String adresse;
    private String diplome;
    private String speciality;
    private int numCCP;
    private String numTel;
    private String email;
    private String Situation;
    private int jourNaissance;
    private String moisNaissance;
    private int anneeNaissance;
    private int nbrHAilleurs;
    private String remarque;
    private Boolean etat;

    public Vacataire(String nom, String prenom, String adresse, String diplome,String speciality,String Genre,String s, int numCCP, String numTel,
                     String email, int jourNaissance, String moisNaissance, int anneeNaissance, int nbrHAilleurs,
                     String remarque, Boolean etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.diplome = diplome;
        this.speciality=speciality;
        this.numCCP = numCCP;
        this.numTel = numTel;
        this.email = email;
        this.jourNaissance = jourNaissance;
        this.moisNaissance = moisNaissance;
        this.anneeNaissance = anneeNaissance;
        this.nbrHAilleurs = nbrHAilleurs;
        this.remarque = remarque;
        this.etat = etat;
        this.Genre=Genre;
        this.Situation=s;
    }

    public static int getMatricule() {
        return matricule;
    }

    public void setMatriqule(int matricule) {
        this.matricule = matricule;
    }

    public Vacataire() {
        this.nom = null;
        this.prenom = null;
        this.adresse = null;
        this.diplome = null;
        this.numCCP = 0;
        this.numTel = null;
        this.email = null;
        this.jourNaissance = 0;
        this.moisNaissance = null;
        this.anneeNaissance = 0;
        this.nbrHAilleurs = 0;
        this.remarque = null;
        this.etat = false;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public int getNumCCP() {
        return numCCP;
    }

    public void setNumCCP(int numCCP) {
        this.numCCP = numCCP;
    }

    public String getNumTel() {
        return numTel;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getJourNaissance() {
        return jourNaissance;
    }

    public void setJourNaissance(int jourNaissance) {
        this.jourNaissance = jourNaissance;
    }

    public String getMoisNaissance() {
        return moisNaissance;
    }

    public void setMoisNaissance(String moisNaissance) {
        this.moisNaissance = moisNaissance;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public int getNbrHAilleurs() {
        return nbrHAilleurs;
    }


    public void setNbrHAilleurs(int nbrHAilleurs) {
        this.nbrHAilleurs = nbrHAilleurs;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getSituation() {
        return Situation;
    }

    public void setSituation(String situation) {
        Situation = situation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}