/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.kotlin.kotlin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.kotlin.kotlin.Model#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.kotlin.kotlin.KotlinPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(When)
   * @see org.xtext.example.kotlin.kotlin.KotlinPackage#getModel_When()
   * @model containment="true"
   * @generated
   */
  When getWhen();

  /**
   * Sets the value of the '{@link org.xtext.example.kotlin.kotlin.Model#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(When value);

} // Model
