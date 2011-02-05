/*
 * Copyright (C) 2011 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.usb4java.jsr80;

import javax.usb.UsbConfigurationDescriptor;

import de.ailis.usb4java.USB_Config_Descriptor;


/**
 * usb4java implementation of JSR-80 UsbConfigurationDescriptor.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

final class UsbConfigurationDescriptorImpl extends
        UsbDescriptorImpl<USB_Config_Descriptor> implements
        UsbConfigurationDescriptor
{
    /**
     * Constructor.
     *
     * @param descriptor
     *            The low-level USB configuration descriptor.
     */

    public UsbConfigurationDescriptorImpl(final USB_Config_Descriptor
        descriptor)
    {
        super(descriptor);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#wTotalLength()
     */

    @Override
    public short wTotalLength()
    {
        return (short) (this.descriptor.wTotalLength() & 0xffff);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#bNumInterfaces()
     */

    @Override
    public byte bNumInterfaces()
    {
        return (byte) (this.descriptor.bNumInterfaces() & 0xff);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#bConfigurationValue()
     */

    @Override
    public byte bConfigurationValue()
    {
        return (byte) (this.descriptor.bConfigurationValue() & 0xff);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#iConfiguration()
     */

    @Override
    public byte iConfiguration()
    {
        return (byte) (this.descriptor.iConfiguration() & 0xff);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#bmAttributes()
     */

    @Override
    public byte bmAttributes()
    {
        return (byte) (this.descriptor.bmAttributes() & 0xff);
    }


    /**
     * @see javax.usb.UsbConfigurationDescriptor#bMaxPower()
     */

    @Override
    public byte bMaxPower()
    {
        return (byte) (this.descriptor.MaxPower() & 0xff);
    }


    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(final Object o)
    {
        if (o == null) return false;
        if (this == o) return true;
        if (o.getClass() != getClass()) return false;
        final UsbConfigurationDescriptorImpl other =
            (UsbConfigurationDescriptorImpl) o;
        return this.descriptor.equals(other.descriptor);
    }


    /**
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode()
    {
        return this.descriptor.hashCode();
    }
}
