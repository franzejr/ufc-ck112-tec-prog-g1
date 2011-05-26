package com.vaannila.fileupload;




import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

/**
 * Show case File Upload example's action. <code>FileUploadAction</code>
 *
 */
public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 5156288255337069381L;
	
	private String contentType;
    private File upload;
    private String fileName;
    private String caption;
    
    // since we are using <s:file name="upload" .../> the file name will be
    // obtained through getter/setter of <file-tag-name>FileName
    public String getUploadFileName() {
    	return fileName;
    }
    public void setUploadFileName(String fileName) {
    	this.fileName = fileName;
    }

    
    // since we are using <s:file name="upload" ... /> the content type will be
    // obtained through getter/setter of <file-tag-name>ContentType
    public String getUploadContentType() {
        return contentType;
    }
    public void setUploadContentType(String contentType) {
        this.contentType = contentType;
    }

    
    // since we are using <s:file name="upload" ... /> the File itself will be
    // obtained through getter/setter of <file-tag-name>
    public File getUpload() {
        return upload;
    }
    public void setUpload(File upload) {
        this.upload = upload;
    }

    
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String input() throws Exception {
        return SUCCESS;
    }

    public String upload() throws Exception  {
        return SUCCESS;
    }

}
