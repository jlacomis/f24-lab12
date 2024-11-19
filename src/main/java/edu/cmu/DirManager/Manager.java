package edu.cmu.DirManager;

public interface Manager {
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return 0 if the directory creation was successful
     *        -1 if the directory already exists,
     *        -2 if the path is invalid,
     *        -3 if the directory could not be created for some other reason
     */
    public int newDirectory(String path);
}
