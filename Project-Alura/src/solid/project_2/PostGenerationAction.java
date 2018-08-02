package solid.project_2;

public interface PostGenerationAction {

    /** Essa interface eh estavel pelo fato de varias outras
     * classes dependerem dela, portanto, ela dificilmente sofrera mudanças,
     *  uma vez que ela tem abstraido o comportamento das açoes.
     *  Por essa razão o InvoiceGenerator depende dela, pois ela eh estavel**/

    void execute(ElectronicInvoice invoice);

}
