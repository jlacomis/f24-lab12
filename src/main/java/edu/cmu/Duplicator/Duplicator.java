package edu.cmu.Duplicator;

public interface Duplicator {
    /**
     * Attempts to execute the given {@link Runnable} twice. 
     *
     * @param runnable the {@link Runnable} to be executed twice
     * @return 0 if the Runnable was executed successfully twice,
     *         1 if it was executed only once, and 
     *        -1 if it was not executed at all
     */
    public int runTwice(Runnable runnable);
}
