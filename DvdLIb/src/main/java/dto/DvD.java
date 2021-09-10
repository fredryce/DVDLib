/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author xwang2945
 */
public class DvD {
    private String title;
    private String releaseDate;
    private String mpaaRating;
    private String director;
    private String studio;
    private String usernote;

    /**
     * @return the title
     */
    public DvD(String title){
        this.title = title;
        
    }
    
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the mpaaRating
     */
    public String getMpaaRating() {
        return mpaaRating;
    }

    /**
     * @param mpaaRating the mpaaRating to set
     */
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * @return the usernote
     */
    public String getUsernote() {
        return usernote;
    }

    /**
     * @param usernote the usernote to set
     */
    public void setUsernote(String usernote) {
        this.usernote = usernote;
    }
    
    
    
}
