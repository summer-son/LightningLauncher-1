package net.pierrox.lightning_launcher.script.api;

/**
 * A binding links a "target" (a property) with a "formula" (a value).
 * An instance of this object can be created with {@link #Binding(String, String, boolean)}; or retrieved with {@link Item#getBindingByTarget(String)} or {@link Item#getBindings()}.
 */
public class Binding {
    private final boolean enabled;
    private final String target;
    private final String formula;

    public Binding(String target, String formula, boolean enabled) {
        this.target = target;
        this.formula = formula;
        this.enabled = enabled;
    }

    /**
     * @hide
     */
    public Binding(net.pierrox.lightning_launcher.engine.variable.Binding binding) {
        this(binding.target, binding.formula, binding.enabled);
    }

    public String getTarget() {
        return target;
    }

    public String getFormula() {
        return formula;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "target: " + target + ", formula: " + formula + (enabled ? " (enabled)" : " (disabled)");
    }
}
