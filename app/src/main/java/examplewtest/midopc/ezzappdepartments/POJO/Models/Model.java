
package examplewtest.midopc.ezzappdepartments.POJO.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Model {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name_english")
    @Expose
    private String nameEnglish;
    @SerializedName("name_arabic")
    @Expose
    private String nameArabic;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("child")
    @Expose
    private String child;
    @SerializedName("parent_id")
    @Expose
    private String parentId;

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The nameEnglish
     */
    public String getNameEnglish() {
        return nameEnglish;
    }

    /**
     *
     * @param nameEnglish
     *     The name_english
     */
    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    /**
     *
     * @return
     *     The nameArabic
     */
    public String getNameArabic() {
        return nameArabic;
    }

    /**
     *
     * @param nameArabic
     *     The name_arabic
     */
    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    /**
     *
     * @return
     *     The img
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img
     *     The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     *     The child
     */
    public String getChild() {
        return child;
    }

    /**
     *
     * @param child
     *     The child
     */
    public void setChild(String child) {
        this.child = child;
    }

    /**
     *
     * @return
     *     The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     *
     * @param parentId
     *     The parent_id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}
