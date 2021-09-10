/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.DvD;
import java.util.List;

/**
 *
 * @author xwang2945
 */
public interface DvdDaoInterface {
    
    DvD addDvd(String studentId, DvD dvd) throws DvdDaoException;

    /**
     * Returns a List of all students in the roster.
     *
     * @return List containing all students in the roster.
     */
    List<DvD> getAllDvd() throws DvdDaoException;

    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists
     *
     * @param studentId ID of the student to retrieve
     * @return the Student object associated with the given student id,  
     * null if no such student exists
     */
    DvD getDvd(String dvdName) throws DvdDaoException;

    /**
     * Removes from the roster the student associated with the given id.
     * Returns the student object that is being removed or null if
     * there is no student associated with the given id
     *
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     */
    DvD removeDvd(String dvdName) throws DvdDaoException;
    
}
