package examplewtest.midopc.ezzappdepartments.POJO.Models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class Contact_D {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("address_english")
    @Expose
    private String addressEnglish;
    @SerializedName("address_arabic")
    @Expose
    private String addressArabic;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("content_ar")
    @Expose
    private String contentAr;
    @SerializedName("content_en")
    @Expose
    private String contentEn;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The addressEnglish
     */
    public String getAddressEnglish() {
        return addressEnglish;
    }

    /**
     *
     * @param addressEnglish
     * The address_english
     */
    public void setAddressEnglish(String addressEnglish) {
        this.addressEnglish = addressEnglish;
    }

    /**
     *
     * @return
     * The addressArabic
     */
    public String getAddressArabic() {
        return addressArabic;
    }

    /**
     *
     * @param addressArabic
     * The address_arabic
     */
    public void setAddressArabic(String addressArabic) {
        this.addressArabic = addressArabic;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     * The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     * The img
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img
     * The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     * @return
     * The contentAr
     */
    public String getContentAr() {
        return contentAr;
    }

    /**
     *
     * @param contentAr
     * The content_ar
     */
    public void setContentAr(String contentAr) {
        this.contentAr = contentAr;
    }

    /**
     *
     * @return
     * The contentEn
     */
    public String getContentEn() {
        return contentEn;
    }

    /**
     *
     * @param contentEn
     * The content_en
     */
    public void setContentEn(String contentEn) {
        this.contentEn = contentEn;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
