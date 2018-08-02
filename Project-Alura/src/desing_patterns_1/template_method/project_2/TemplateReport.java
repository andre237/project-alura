package desing_patterns_1.template_method.project_2;

public abstract class TemplateReport implements Report {

    @Override
    public final void generateReport() {
        header();
        body();
        footer();
    }

    protected abstract void header();
    protected abstract void footer();
    protected abstract void body();

}
