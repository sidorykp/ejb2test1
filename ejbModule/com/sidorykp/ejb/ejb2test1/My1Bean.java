/**
 * 
 */
package com.sidorykp.ejb.ejb2test1;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionContext;


/**
 *
 * <!-- begin-user-doc -->
 * A generated session bean
 * <!-- end-user-doc -->
 * *
 * <!-- begin-xdoclet-definition --> 
 * @ejb.bean name="My1"	
 *           description="An EJB named My1"
 *           display-name="My1"
 *           jndi-name="My1"
 *           type="Stateless" 
 *           transaction-type="Container"
 * 
 * <!-- end-xdoclet-definition --> 
 * @generated
 */

public abstract class My1Bean implements javax.ejb.SessionBean
{

    /** 
     * <!-- begin-xdoclet-definition --> 
     * <!-- end-xdoclet-definition --> 
     * @generated
     */
    private static final long serialVersionUID = 1L;

    /** 
     *
     * <!-- begin-xdoclet-definition --> 
     * @ejb.create-method view-type="remote"
     * <!-- end-xdoclet-definition --> 
     * @generated
     *
     * //TODO: Must provide implementation for bean create stub
     */
    public void ejbCreate()
    {
    }

    /** 
     *
     * <!-- begin-xdoclet-definition --> 
     * @ejb.interface-method view-type="remote"
     * <!-- end-xdoclet-definition --> 
     * @generated
     *
     * //TODO: Must provide implementation for bean method stub
     */
    public String foo(String param)
    {
        return "My1Bean hello !";
    }

    /* (non-Javadoc)
     * @see javax.ejb.SessionBean#ejbActivate()
     */
    public void ejbActivate() throws EJBException,RemoteException
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see javax.ejb.SessionBean#ejbPassivate()
     */
    public void ejbPassivate() throws EJBException,RemoteException
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see javax.ejb.SessionBean#ejbRemove()
     */
    public void ejbRemove() throws EJBException,RemoteException
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
     */
    public void setSessionContext(SessionContext ctx) throws EJBException,
            RemoteException
    {
        // TODO Auto-generated method stub

    }

    /**
     * 
     */
    public My1Bean()
    {
        // TODO Auto-generated constructor stub
    }
}
