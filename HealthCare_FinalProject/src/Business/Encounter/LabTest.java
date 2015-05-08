/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

/**
 *
 * @author user
 */
public class LabTest {
    
    private String testType;
    private String testResult;
    
    public enum LabTestType{
        XRay("X-Ray"),
        ECG("ECG"),
        MRI("MRI"),
        CTScan("CT-Scan"),
        Endoscopy("Endoscopy");
        
        
        private String value;
        private LabTestType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return  value;
        }
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
    
}
