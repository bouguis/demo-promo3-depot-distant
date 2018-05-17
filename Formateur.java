public class Formateur{

	private String nom;
	private String prenom;
	private String email;
	private int anneExperience;

	public Formateur(){
		
	}
	public Formateur(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
		
	}

	//Accesseurs et propriete

	public voit getNom(){

		return this.nom;
	}

	public voit getPreNom(){

		return this.prenom;
	}

	public voit getEmail(){

		return this.email;
	}

	public voit getAnneExperience(){

		return this.anneExperience;
	}
	//Modificateur des propriete
	public void setNom(String nom){

		this.nom=nom;

	}
	public void setPrenom(String prenom){

		this.prenom=prenom;

	}
	public void setEmail(String email){

		this.email=email;

	}
	public int setAnneExperience(int a){

		this.anneExperience=anneExperience;

	}








}