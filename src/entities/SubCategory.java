/**
 * Trabalho de Orientacao a Objetos
 * Orçamento de uma República  
 * Feito por: Ana Julia       180097504
 *            Davi Matheus    190042419
 *            Lais Portela    190046848
 *            Lucas Rodrigues 180125974
 *            Nilvan Junior   170122468
 */
package entities;

import exceptions.NoCategoryFoundException;

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
		if(subCategoryName == getCategoryName()) {
			throw new NoCategoryFoundException("Invalid Sub-Category");
		}
	}

	// Polimorfismo
    @Override
    public String toString() {
        return "SubCategory [subCategoryName=" + subCategoryName +"" +super.toString()+ "]";
    }
	
}
