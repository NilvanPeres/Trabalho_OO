/**
 * Trabalho de Orientacao a Objetos 
 * Feito por: Ana Julia 
 *            Davi Matheus
 *            Lais Portela
 *            Lucas Rodrigues
 *            Nilvan Junior
 */
package entities;

public class SubCategory extends Category{

	// Atributo
	private String subCategoryName; // nome da subcategoria
	
	// Construtor
	public SubCategory(String categoryName) {
		super(categoryName);
	}
	
	// Metodos gets e sets
	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	// Polimorfismo
    @Override
    public String toString() {
        return "SubCategory [subCategoryName=" + subCategoryName +"" +super.toString()+ "]";
    }
	
}
