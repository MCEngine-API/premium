package io.github.mcengine.api.premium.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Premium-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide premium-related library support to the system.
 */
public interface IMCEnginePremiumLibrary {
    /**
     * Called when the Premium Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Premium Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
