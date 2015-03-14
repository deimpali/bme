/**
 */
package petrinet.model.petri;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge To Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.model.petri.EdgeToTransition#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.model.petri.PetriPackage#getEdgeToTransition()
 * @model
 * @generated
 */
public interface EdgeToTransition extends Edge {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Transition)
	 * @see petrinet.model.petri.PetriPackage#getEdgeToTransition_In()
	 * @model required="true"
	 * @generated
	 */
	Transition getIn();

	/**
	 * Sets the value of the '{@link petrinet.model.petri.EdgeToTransition#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Transition value);

} // EdgeToTransition
