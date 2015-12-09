/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.StructuralPatterns.ProxyAKASurrogate;

/**
 * Provide a surrogate or placeholder for another object to control access to it.
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Nov 6, 2005 5:15:39 PM
 * @since SDK1.3
 */
public class MainProgram {
    public static void main(String[] args) {
        SubjectProxy aSubjectProxy = new SubjectProxy();
        aSubjectProxy.read();
    }
}
