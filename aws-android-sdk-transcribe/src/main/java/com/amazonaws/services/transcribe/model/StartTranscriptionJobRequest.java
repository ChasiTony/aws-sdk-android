/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts an asynchronous job to transcribe speech to text.
 * </p>
 */
public class StartTranscriptionJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String transcriptionJobName;

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     */
    private String mediaFormat;

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the job. The name must be unique within an AWS
     *         account.
     *         </p>
     */
    public String getTranscriptionJobName() {
        return transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the job. The name must be unique within an AWS
     *            account.
     *            </p>
     */
    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the job. The name must be unique within an AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     *
     * @return <p>
     *         The language code for the language used in the input media file.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     *
     * @param languageCode <p>
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     *
     * @param languageCode <p>
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartTranscriptionJobRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     *
     * @param languageCode <p>
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US
     *
     * @param languageCode <p>
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the audio track in the input media
     *         file.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in the input
     *            media file.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in the input
     *            media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @return <p>
     *         The format of the input media file.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public StartTranscriptionJobRequest withMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public StartTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     *
     * @return <p>
     *         An object that describes the input media for a transcription job.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     *
     * @param media <p>
     *            An object that describes the input media for a transcription
     *            job.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            An object that describes the input media for a transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     *
     * @return <p>
     *         A <code>Settings</code> object that provides optional settings
     *         for a transcription job.
     *         </p>
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a transcription job.
     *            </p>
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: " + getTranscriptionJobName() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: " + getMediaSampleRateHertz() + ",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: " + getMediaFormat() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTranscriptionJobRequest == false)
            return false;
        StartTranscriptionJobRequest other = (StartTranscriptionJobRequest) obj;

        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null
                && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null
                && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null
                && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
