

/* First created by JCasGen Fri Feb 03 12:14:57 CET 2012 */
package de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.tweet;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.O;


/** emoticon
 * Updated by JCasGen Fri Feb 03 12:29:12 CET 2012
 * XML source: /home/zesch/workspace/de.tudarmstadt.ukp.dkpro.core-asl/de.tudarmstadt.ukp.dkpro.core.api.lexmorph/src/main/resources/desc/type/TweetPOS.xml
 * @generated */
public class EMO extends O {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(EMO.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EMO() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EMO(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EMO(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EMO(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    