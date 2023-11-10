/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.analysis;

import giotto.giottoc.node.*;

import java.util.Hashtable;

/**
 * @author M.A.A. Sanvido
 * @version AnalysisAdapter.java,v 1.7 2004/10/01 01:09:56 cxh Exp
 * @since Giotto 1.0.1
 */
public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if (in == null)
            {
                return null;
            }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if (this.in == null)
            {
                this.in = new Hashtable(1);
            }

        if (in != null)
            {
                this.in.put(node, in);
            }
        else
            {
                this.in.remove(node);
            }
    }

    public Object getOut(Node node)
    {
        if (out == null)
            {
                return null;
            }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if (this.out == null)
            {
                this.out = new Hashtable(1);
            }

        if (out != null)
            {
                this.out.put(node, out);
            }
        else
            {
                this.out.remove(node);
            }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseAModuleDeclarationSequence(AModuleDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseAConcreteModuleDeclarationList(AConcreteModuleDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseAModuleDeclarationList(AModuleDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseAModuleDeclarationTail(AModuleDeclarationTail node)
    {
        defaultCase(node);
    }

    public void caseAModuleDeclaration(AModuleDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAConcreteQualident(AConcreteQualident node)
    {
        defaultCase(node);
    }

    public void caseAQualident(AQualident node)
    {
        defaultCase(node);
    }

    public void caseAQualidentTail(AQualidentTail node)
    {
        defaultCase(node);
    }

    public void caseATypeDeclarationSequence(ATypeDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseATypeDeclaration(ATypeDeclaration node)
    {
        defaultCase(node);
    }

    public void caseASensorDeclarationSequence(ASensorDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseASensorDeclaration(ASensorDeclaration node)
    {
        defaultCase(node);
    }

    public void caseADeviceDriver(ADeviceDriver node)
    {
        defaultCase(node);
    }

    public void caseAActuatorDeclarationSequence(AActuatorDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseAActuatorDeclaration(AActuatorDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAOutputDeclarationSequence(AOutputDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseAOutputDeclaration(AOutputDeclaration node)
    {
        defaultCase(node);
    }

    public void caseATaskDeclaration(ATaskDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAFormalPorts(AFormalPorts node)
    {
        defaultCase(node);
    }

    public void caseAConcreteFormalPortList(AConcreteFormalPortList node)
    {
        defaultCase(node);
    }

    public void caseAFormalPortList(AFormalPortList node)
    {
        defaultCase(node);
    }

    public void caseAFormalPortTail(AFormalPortTail node)
    {
        defaultCase(node);
    }

    public void caseAFormalPort(AFormalPort node)
    {
        defaultCase(node);
    }

    public void caseAActualPorts(AActualPorts node)
    {
        defaultCase(node);
    }

    public void caseAConcreteActualPortList(AConcreteActualPortList node)
    {
        defaultCase(node);
    }

    public void caseAActualPortList(AActualPortList node)
    {
        defaultCase(node);
    }

    public void caseAActualPortTail(AActualPortTail node)
    {
        defaultCase(node);
    }

    public void caseAActualPort(AActualPort node)
    {
        defaultCase(node);
    }

    public void caseAStatePorts(AStatePorts node)
    {
        defaultCase(node);
    }

    public void caseAConcreteStatePortList(AConcreteStatePortList node)
    {
        defaultCase(node);
    }

    public void caseAStatePortList(AStatePortList node)
    {
        defaultCase(node);
    }

    public void caseAStatePortTail(AStatePortTail node)
    {
        defaultCase(node);
    }

    public void caseAStatePort(AStatePort node)
    {
        defaultCase(node);
    }

    public void caseAScheduleTask(AScheduleTask node)
    {
        defaultCase(node);
    }

    public void caseAActualScopedParameters(AActualScopedParameters node)
    {
        defaultCase(node);
    }

    public void caseAConcreteActualScopedParameterList(AConcreteActualScopedParameterList node)
    {
        defaultCase(node);
    }

    public void caseAActualScopedParameterList(AActualScopedParameterList node)
    {
        defaultCase(node);
    }

    public void caseAActualScopedParameterTail(AActualScopedParameterTail node)
    {
        defaultCase(node);
    }

    public void caseAActualScopedParameter(AActualScopedParameter node)
    {
        defaultCase(node);
    }

    public void caseADriverDeclaration(ADriverDeclaration node)
    {
        defaultCase(node);
    }

    public void caseACallDriver(ACallDriver node)
    {
        defaultCase(node);
    }

    public void caseAGuardParameters(AGuardParameters node)
    {
        defaultCase(node);
    }

    public void caseAModeDeclarationSequence(AModeDeclarationSequence node)
    {
        defaultCase(node);
    }

    public void caseAModeDeclaration(AModeDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAActuatorUpdate(AActuatorUpdate node)
    {
        defaultCase(node);
    }

    public void caseAModeSwitch(AModeSwitch node)
    {
        defaultCase(node);
    }

    public void caseATaskInvocation(ATaskInvocation node)
    {
        defaultCase(node);
    }

    public void caseAHardwareAnnotation(AHardwareAnnotation node)
    {
        defaultCase(node);
    }

    public void caseAConcreteHardwareDeclarationList(AConcreteHardwareDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseAHardwareDeclarationList(AHardwareDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseAHardwareDeclarationTail(AHardwareDeclarationTail node)
    {
        defaultCase(node);
    }

    public void caseAHostHardwareDeclaration(AHostHardwareDeclaration node)
    {
        defaultCase(node);
    }

    public void caseANetworkHardwareDeclaration(ANetworkHardwareDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAHostDeclaration(AHostDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAHostPriorities(AHostPriorities node)
    {
        defaultCase(node);
    }

    public void caseAIP(AIP node)
    {
        defaultCase(node);
    }

    public void caseAConcretePriorityList(AConcretePriorityList node)
    {
        defaultCase(node);
    }

    public void caseAPriorityList(APriorityList node)
    {
        defaultCase(node);
    }

    public void caseAPriorityTail(APriorityTail node)
    {
        defaultCase(node);
    }

    public void caseAPriorityProd(APriorityProd node)
    {
        defaultCase(node);
    }

    public void caseANetworkDeclaration(ANetworkDeclaration node)
    {
        defaultCase(node);
    }

    public void caseANetworkConnection(ANetworkConnection node)
    {
        defaultCase(node);
    }

    public void caseAHostNameIdent(AHostNameIdent node)
    {
        defaultCase(node);
    }

    public void caseAConcreteHostList(AConcreteHostList node)
    {
        defaultCase(node);
    }

    public void caseAHostList(AHostList node)
    {
        defaultCase(node);
    }

    public void caseAHostTail(AHostTail node)
    {
        defaultCase(node);
    }

    public void caseAPortMappingAnnotation(APortMappingAnnotation node)
    {
        defaultCase(node);
    }

    public void caseANetworkTimeslotAnnotation(ANetworkTimeslotAnnotation node)
    {
        defaultCase(node);
    }

    public void caseAConcreteNetworkTimeslotDeclarationList(AConcreteNetworkTimeslotDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseANetworkTimeslotDeclarationList(ANetworkTimeslotDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseANetworkTimeslotDeclarationTail(ANetworkTimeslotDeclarationTail node)
    {
        defaultCase(node);
    }

    public void caseANetworkTimeslotDeclaration(ANetworkTimeslotDeclaration node)
    {
        defaultCase(node);
    }

    public void caseANetworkNameIdent(ANetworkNameIdent node)
    {
        defaultCase(node);
    }

    public void caseAConcreteTimeslotDeclarationList(AConcreteTimeslotDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseATimeslotDeclarationList(ATimeslotDeclarationList node)
    {
        defaultCase(node);
    }

    public void caseATimeslotDeclarationTail(ATimeslotDeclarationTail node)
    {
        defaultCase(node);
    }

    public void caseATimeslotDeclaration(ATimeslotDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAModeConnectionAnnotation(AModeConnectionAnnotation node)
    {
        defaultCase(node);
    }

    public void caseAConcreteScheduleConnectionList(AConcreteScheduleConnectionList node)
    {
        defaultCase(node);
    }

    public void caseAScheduleConnectionList(AScheduleConnectionList node)
    {
        defaultCase(node);
    }

    public void caseAScheduleConnectionTail(AScheduleConnectionTail node)
    {
        defaultCase(node);
    }

    public void caseAScheduleConnection(AScheduleConnection node)
    {
        defaultCase(node);
    }

    public void caseADestinations(ADestinations node)
    {
        defaultCase(node);
    }

    public void caseANetworkTimeslots(ANetworkTimeslots node)
    {
        defaultCase(node);
    }

    public void caseAConcreteTimeslotList(AConcreteTimeslotList node)
    {
        defaultCase(node);
    }

    public void caseATimeslotList(ATimeslotList node)
    {
        defaultCase(node);
    }

    public void caseATimeslotTail(ATimeslotTail node)
    {
        defaultCase(node);
    }

    public void caseATimeslot(ATimeslot node)
    {
        defaultCase(node);
    }

    public void caseAActualGlobalParameters(AActualGlobalParameters node)
    {
        defaultCase(node);
    }

    public void caseAConcreteActualGlobalParameterList(AConcreteActualGlobalParameterList node)
    {
        defaultCase(node);
    }

    public void caseAActualGlobalParameterList(AActualGlobalParameterList node)
    {
        defaultCase(node);
    }

    public void caseAActualGlobalParameterTail(AActualGlobalParameterTail node)
    {
        defaultCase(node);
    }

    public void caseAActualGlobalParameter(AActualGlobalParameter node)
    {
        defaultCase(node);
    }

    public void caseAModeSwitchAnnotation(AModeSwitchAnnotation node)
    {
        defaultCase(node);
    }

    public void caseATaskAnnotation(ATaskAnnotation node)
    {
        defaultCase(node);
    }

    public void caseATaskPriority(ATaskPriority node)
    {
        defaultCase(node);
    }

    public void caseATaskWcetAnnotation(ATaskWcetAnnotation node)
    {
        defaultCase(node);
    }

    public void caseATaskTimingAnnotation(ATaskTimingAnnotation node)
    {
        defaultCase(node);
    }

    public void caseTModule(TModule node)
    {
        defaultCase(node);
    }

    public void caseTType(TType node)
    {
        defaultCase(node);
    }

    public void caseTIs(TIs node)
    {
        defaultCase(node);
    }

    public void caseTSensor(TSensor node)
    {
        defaultCase(node);
    }

    public void caseTUses(TUses node)
    {
        defaultCase(node);
    }

    public void caseTActuator(TActuator node)
    {
        defaultCase(node);
    }

    public void caseTOutput(TOutput node)
    {
        defaultCase(node);
    }

    public void caseTTask(TTask node)
    {
        defaultCase(node);
    }

    public void caseTSchedule(TSchedule node)
    {
        defaultCase(node);
    }

    public void caseTState(TState node)
    {
        defaultCase(node);
    }

    public void caseTDriver(TDriver node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    public void caseTStart(TStart node)
    {
        defaultCase(node);
    }

    public void caseTMode(TMode node)
    {
        defaultCase(node);
    }

    public void caseTPeriod(TPeriod node)
    {
        defaultCase(node);
    }

    public void caseTActfreq(TActfreq node)
    {
        defaultCase(node);
    }

    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    public void caseTExitfreq(TExitfreq node)
    {
        defaultCase(node);
    }

    public void caseTTaskfreq(TTaskfreq node)
    {
        defaultCase(node);
    }

    public void caseTHost(THost node)
    {
        defaultCase(node);
    }

    public void caseTAddress(TAddress node)
    {
        defaultCase(node);
    }

    public void caseTPriorities(TPriorities node)
    {
        defaultCase(node);
    }

    public void caseTNetwork(TNetwork node)
    {
        defaultCase(node);
    }

    public void caseTConnects(TConnects node)
    {
        defaultCase(node);
    }

    public void caseTSlots(TSlots node)
    {
        defaultCase(node);
    }

    public void caseTPush(TPush node)
    {
        defaultCase(node);
    }

    public void caseTFrom(TFrom node)
    {
        defaultCase(node);
    }

    public void caseTTo(TTo node)
    {
        defaultCase(node);
    }

    public void caseTIn(TIn node)
    {
        defaultCase(node);
    }

    public void caseTPriority(TPriority node)
    {
        defaultCase(node);
    }

    public void caseTWcet(TWcet node)
    {
        defaultCase(node);
    }

    public void caseTIdent(TIdent node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTGreaterThan(TGreaterThan node)
    {
        defaultCase(node);
    }

    public void caseTLessOrEqual(TLessOrEqual node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }

    public void caseTRBracket(TRBracket node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}