
public abstract class MedicalProcedureDecoratorAPI implements MedicalProcedureAPI{

	@Override
	public abstract String getCode();

	@Override
	public abstract String getDesc();

	@Override
	public abstract double getCost();

}
