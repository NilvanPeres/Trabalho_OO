
package entities;

public class SubCategory extends Category{

	// Atributo
	private String SubCategoryName; // nome da subcategoria
	
	// Construtor
	 public SubCategory(String SubCategoryName) {
		 super(SubCategoryName);
		 this.SubCategoryName = SubCategoryName;
		}
	
	// Metodos gets e sets
	public String getSubCategoryName() {
		return SubCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.SubCategoryName = subCategoryName;
	}

	// Polimorfismo
    @Override
    public String toString() {
        return "Subcategory: "
        + SubCategoryName;
    }
	
}