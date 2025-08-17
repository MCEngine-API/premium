package io.github.mcengine.api.premium.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Premium-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide premium-related APIs to the system.
 */
public interface IMCEnginePremiumAPI {
    /**
     * Called when the Premium API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Premium API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
