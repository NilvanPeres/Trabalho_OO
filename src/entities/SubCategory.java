
package entities;

public class SubCategory extends Category{

	// Atributo
	private String subCategoryName; // nome da subcategoria
	
	// Construtor
	public SubCategory(String categoryName) {
		super(categoryName);
		this.subCategoryName = subCategoryName;
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
        return "Category: "
        + getCategoryName()
        + "Subcategory"
        + subCategoryName;
    }
	
}