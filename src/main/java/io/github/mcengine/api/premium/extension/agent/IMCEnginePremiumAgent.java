package io.github.mcengine.api.premium.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Premium-based Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate premium-related agents into the system.
 */
public interface IMCEnginePremiumAgent {
    /**
     * Called when the Premium Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Premium Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
